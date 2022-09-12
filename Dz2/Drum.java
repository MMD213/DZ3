public class Drum implements TheTool{
    int diameter;
    Drum( int diameter ) {
        this.diameter= diameter;
    }
    public void play() {
        System.out.println("Играет барабан с диаметром "+ diameter);
    }
}

