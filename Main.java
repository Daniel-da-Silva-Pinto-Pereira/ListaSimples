class Main {
  public static void main(String[] args){ 
  ListaSimples l = new ListaSimples();
  System.out.println(l);
  l.inserirFim("a");
  System.out.println(l);
  l.inserirFim("b");
  System.out.println(l);
  l.inserirFim("c");
  System.out.println(l);
  // l.inserirIndice(3, "x");
  l.retirarIndice(0);
  System.out.println(l);
  while(l.retirarFim() != null){
    System.out.println(l);
  }

}
}