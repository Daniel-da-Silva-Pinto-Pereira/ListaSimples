class ListaSimples{
 No inicio = null;
 int tamanho = 0;
// Inserir um No no Inicio da lista
 public void inserirInicio(String info){
   No no = new No();
   no.info = info;
   no.proximo = inicio;
   inicio = no;
   tamanho++;
 }

 public String toString(){
     String str ="(" + tamanho +")";
     No local = inicio;
     while (local != null){
       str += local.info + " ";
       local = local.proximo;
     }
     return str;

 }
 // retirar um NO no Inicio da Lista
 public String retirarInicio(){
   if (inicio == null){
     return null;
   }
   String info = inicio.info;
   inicio = inicio.proximo;
   tamanho--;
   return info;
 }
 // inserindo um No no fim da lista
 public void inserirFim(String info){
    No no = new No();
    no.info = info;
    if (inicio == null){
      no.proximo = null;
      inicio = no;
    }
    else {
      No local = inicio;
      while (local.proximo != null){
          local = local.proximo;
      }
      local.proximo = no;
      no.proximo = null;
    }
    tamanho++;
    }
    // Retirando um NO no fim da lista
    public String retirarFim(){
      if (inicio == null){
        return null;
      }
      No local = inicio;
      while (local.proximo != null){
        No aux = local;
        local = local.proximo;
        if  (local.proximo == null){
          aux.proximo = null;
          tamanho --;
          return local.info;
        
        }
      }
    
    inicio = null;
    tamanho --;
    return local.info;
    }
   // Inserir um Indice na lista
    public void inserirIndice(int indice, String info){
      if (indice <= 0){
        inserirInicio(info);
      }
      else if (indice >= tamanho){
        inserirFim(info);
      }
      else {
        No local = inicio;
        for (int i = 0; i < indice -1; i++){
          local = local.proximo;
        }
        No no = new No();
        no.info = info;
        no.proximo = local.proximo;
        local.proximo = no;
        tamanho++;
      }
      }

    // Retirar um Indice na lista
    public String retirarIndice(int indice){
      if (indice < 0 || indice >= tamanho || inicio == null){
        return null;
      }
      else if (indice == 0) {
        return retirarInicio();
      }
      else if (indice == tamanho -1){
        return retirarFim();
      }
      No local = inicio;
      for (int i = 0; i < indice - 1; i++){
        local = local.proximo;
      }
      String info = local.proximo.info;
      local.proximo = local.proximo.proximo;
      tamanho--;
      return info;
    }

 }