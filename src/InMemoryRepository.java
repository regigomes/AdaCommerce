import java.util.ArrayList;
import java.util.List;

public class InMemoryRepository<T> implements GenericRepository<T> {
    private final List<T> database = new ArrayList<>();

    @Override
    public void cadastrar(T entidade) {
        database.add(entidade);
        System.out.println("Entidade cadastrada com sucesso!");
    }

    @Override
    public List<T> listarTodos() {
        return new ArrayList<>(database);
    }

    @Override
    public void atualizar(T entidade) {
        System.out.println("Entidade atualizada (simulação).");
    }
}
