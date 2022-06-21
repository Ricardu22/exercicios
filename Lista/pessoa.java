import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class addPessoa {
//Usando add() para adicionar elelentos
   lista.add("João");
   lista.add("José");
   lista.add("Maria");
   lista.add("Doroteia");
}

public class delPessoa {
// Removendo elementos com remove() 
   lista.remove("José");
   lista.remove("Maria");

}

public String busca(Joao, id) {
   busca lista = Busca.getById(int, id);
   return (Busca == null) ? "Sem retorno" : Busca.toString();

}


public List<lista> getAll() {
  List<lista01> id = new ArrayList<lista>();
  for (lista01 id : lista01.getAll()) {
    if(id.getProperty(Details.class)!=null)
      id.add(lista01);
  }
  Collections.sort(id);
  return id;
}
