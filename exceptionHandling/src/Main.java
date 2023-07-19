public class Main {
    public static void main(String[] args) {//hata yönetimi
        //kod çalışıyor ama istediğimiz sonucu vermiyor
        try {
            int[] sayilar = new int[]{1, 2, 3};//dinamik gelir-veri kaynağından
            System.out.println(sayilar[5]);
        } catch (Exception exception) {
            System.out.println("hata oluştu");
            System.out.println(exception);
        } finally {
            System.out.println("Ben her türlü çalışırım");
        }//catch de çalışsa try da çalışsa
    }
}
