import dao.DespesaDAO;
import model.Categoria;
import model.Despesa;

import java.time.LocalDate;
import java.util.Optional;

public class AtualizarDespesa {
    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
        Optional<Despesa> despesaOptional = dao.findById(3L);

        Despesa despesa = despesaOptional.get();
        System.out.println(despesa.getId());
        System.out.println(despesa.getDescricao());
        System.out.println(despesa.getData());
        System.out.println(despesa.getValor());
        System.out.println(despesa.getCategoria());

        despesa.setDescricao("Bar");
        despesa.setData(LocalDate.of(2021, 8, 10));
        despesa.setValor(60);
        despesa.setCategoria(Categoria.OUTROS);

        dao.update(despesa);
    }
}
