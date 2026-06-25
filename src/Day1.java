import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Day1 {

    static class Usuario {
        private String id;
        private String nome;
        private String email;
        private int idade;
        private boolean ativo;

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }

        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public int getIdade() { return idade; }
        public void setIdade(int idade) { this.idade = idade; }

        public boolean isAtivo() { return ativo; }
        public void setAtivo(boolean ativo) { this.ativo = ativo; }
    }

    interface Repositorio<T> {
        void salvar(T entidade);
        Optional<T> buscarPorId(String id);
        List<T> listarTodos();
        void deletar(String id);
    }

    static class UsuarioRepositorioEmMemoria implements Repositorio<Usuario> {

        private final List<Usuario> usuarios = new ArrayList<>();

        @Override
        public void salvar(Usuario usuario) {
            usuarios.add(usuario);
        }

        @Override
        public Optional<Usuario> buscarPorId(String id) {
            return usuarios.stream()
                    .filter(u -> u.getId().equals(id))
                    .findFirst();
        }

        @Override
        public List<Usuario> listarTodos() {
            return usuarios;
        }

        @Override
        public void deletar(String id) {
            usuarios.removeIf(u -> u.getId().equals(id));
        }

        public List<Usuario> buscarAtivos() {
            return usuarios.stream()
                    .filter(Usuario::isAtivo)
                    .toList();
        }
    }

    record TransacaoDTO(String tipo, double valor, LocalDate data) {}

    static class TransacaoService {

        private final List<TransacaoDTO> transacoes;

        public TransacaoService(List<TransacaoDTO> transacoes) {
            this.transacoes = transacoes;
        }

        public double calcularTotal() {
            return transacoes.stream()
                    .mapToDouble(TransacaoDTO::valor)
                    .sum();
        }

        public Map<String, List<TransacaoDTO>> agruparPorTipo() {
            return transacoes.stream()
                    .collect(Collectors.groupingBy(TransacaoDTO::tipo));
        }

        public List<TransacaoDTO> ordenarPorData() {
            return transacoes.stream()
                    .sorted(Comparator.comparing(TransacaoDTO::data))
                    .toList();
        }
    }

    public static void main(String[] args) {

        List<TransacaoDTO> transacoes = List.of(
                new TransacaoDTO("ENTRADA", 1500.00, LocalDate.of(2026, 6, 20)),
                new TransacaoDTO("SAIDA", 250.00, LocalDate.of(2026, 6, 21)),
                new TransacaoDTO("ENTRADA", 800.00, LocalDate.of(2026, 6, 22)),
                new TransacaoDTO("SAIDA", 120.00, LocalDate.of(2026, 6, 23))
        );

        TransacaoService service = new TransacaoService(transacoes);

        System.out.println(service.calcularTotal());
        System.out.println(service.agruparPorTipo());
        service.ordenarPorData().forEach(System.out::println);

        UsuarioRepositorioEmMemoria repo = new UsuarioRepositorioEmMemoria();

        Usuario u1 = new Usuario();
        u1.setId("1");
        u1.setNome("Ana");
        u1.setEmail("ana@email.com");
        u1.setIdade(20);
        u1.setAtivo(true);

        Usuario u2 = new Usuario();
        u2.setId("2");
        u2.setNome("Bruno");
        u2.setEmail("bruno@email.com");
        u2.setIdade(30);
        u2.setAtivo(false);

        repo.salvar(u1);
        repo.salvar(u2);

        repo.listarTodos().forEach(u -> System.out.println(u.getNome()));
        repo.buscarAtivos().forEach(u -> System.out.println(u.getNome()));

        System.out.println(
                repo.buscarPorId("1")
                        .map(Usuario::getNome)
                        .orElse("não encontrado")
        );

        repo.deletar("2");

        repo.listarTodos().forEach(u -> System.out.println(u.getNome()));
    }
}