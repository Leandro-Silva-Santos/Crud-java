import dao.DespesaDAO;
import model.Categoria;
import model.Despesa;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ListarDespesas {
    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
        //List<Despesa> despesas = dao.findAll();

        //for (Despesa despesa : despesas) {
          //  System.out.println("ID: " +despesa.getId());
            //System.out.println("Descrição " +despesa.getDescricao());
            //System.out.println("Valor:" +despesa.getValor());

            //System.out.println("============================================");
        //}

    //Optional<Despesa> despesaOptional = dao.findById(5L);
      //  despesaOptional.ifPresent(despesa -> {
        //System.out.println("ID: " +despesa.getId());
        //System.out.println("Descrição " +despesa.getDescricao());
        //System.out.println("Valor:" +despesa.getValor());
    //});

    List<Despesa> despesas = dao.findByCategoria(Categoria.TRANSPORTE);
    for (Despesa despesa : despesas) {
        System.out.println("ID: " +despesa.getId());
        System.out.println("Descrição " +despesa.getDescricao());
        System.out.println("Categoria:" +despesa.getCategoria());
        System.out.println("Valor:" +despesa.getValor());
    }
    }
}
