package projfinal;
public class ProjFinal {
    public static void main(String[] args) {
        Video v1 = new Video("olha o video", 3, 100, 34, false);
        System.out.println( v1.toString());
        //v1.play();
        //System.out.println( v1.toString());
        //v1.like();
        //System.out.println( v1.toString());
        //v1.pause();
        //System.out.println( v1.toString());
        Gafanhoto g1 = new Gafanhoto("gabriele", 19, 'N', "GABI.BAUM70");
        System.out.println(g1.toString());
        
        Visualizacao vis = new Visualizacao(g1, v1);
        System.out.println( v1.toString());
        System.out.println(g1.toString());
        vis.avaliar(7);
        System.out.println( v1.toString());
    }
    
}
