public  class Tube implements TheTool {
    int size ;
    Tube( int size ) {
        this.size = size;
    }
    public void play() {
        System.out.println("Играет труба с размером "+ size);
    }
}