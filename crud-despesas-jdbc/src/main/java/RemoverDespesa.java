import dao.DespesaDAO;

public class RemoverDespesa {

    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
        dao.delete(5L);
    }
}
