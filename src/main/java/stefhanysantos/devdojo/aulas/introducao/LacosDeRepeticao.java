package stefhanysantos.devdojo.aulas.introducao;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        int count = 0;
        while (count < 20){
           System.out.println(++count);
        }

        do {
            System.out.println("dentro do do-white? "+ ++count);
        } while (count < 20);

        for (count = 0; count < 10; count++){
            System.out.println("For "+ ++count);
        }
    }
}
