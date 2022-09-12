public abstract class Main implements TheTool {
    public static void main( String[] args ) {

        TheTool[] musicTools = new TheTool[6];
        musicTools[0] = new Guitar(12);
        musicTools[1] = new Tube(89);
        musicTools[2] = new Drum(86);
        musicTools[3] = new Drum(54);
        musicTools[4] = new Tube(20);
        musicTools[5] = new Guitar(15);

        // for (int i = 0; i < musicTools.length; i++) {
//            Instrument a = musicTools[i]();
//            a.play();
        for (TheTool obj : musicTools) {
            obj.play();
        }
    }
}

