import javax.swing.*;

public class listaCompras {

    public static void main(String[] args) {


        int cerveja = JOptionPane.showConfirmDialog(null, "Vai precisar de Cerveja?");
        if (cerveja == 0) {
            String quantosCerveja = JOptionPane.showInputDialog("Quantos ?");
            double resultadoCerveja = Double.parseDouble(quantosCerveja);
            double valorCerveja = (resultadoCerveja*2.19);
            System.out.println(resultadoCerveja +"  Cervejas    " + "O valor vai ser aproximadamente =  "+ valorCerveja);
        }


        int vinho = JOptionPane.showConfirmDialog(null, "Vai precisar de Vinho?");
        if (vinho == 0) {
            String quantosVinho = JOptionPane.showInputDialog("Quantos ?");
            double resultadoVinho = Double.parseDouble(quantosVinho);
            double valorVinho = (resultadoVinho*17);
            System.out.println(resultadoVinho +"  Vinho       " + "O valor vai ser aproximadamente =  "+ valorVinho);
        }


        int agua = JOptionPane.showConfirmDialog(null, "Vai precisar de Água Mineral");
        if (agua == 0) {
            String quantosAgua = JOptionPane.showInputDialog("Quantos ?");
            double resultadoAgua = Double.parseDouble(quantosAgua);
            double valorAgua = (resultadoAgua*5.99);
            System.out.println(resultadoAgua +"  Aguas       " + "O valor vai ser aproximadamente =  "+ valorAgua);
        }



        int papeltoalha = JOptionPane.showConfirmDialog(null, "Vai precisar de Papel Toalha");
        if (papeltoalha == 0) {
            String quantospapeltoalha = JOptionPane.showInputDialog("Quantos ?");
            double resultadopapeltoalha = Double.parseDouble(quantospapeltoalha);
            double valorpapeltoalha = (resultadopapeltoalha*3.29);
            System.out.println(resultadopapeltoalha +"  papeltoalha  " + "O valor vai ser aproximadamente =  "+ valorpapeltoalha);
        }


        int sacodelixo = JOptionPane.showConfirmDialog(null, "Vai precisar de Saco de Lixo");
        if (sacodelixo == 0) {
            String quantossacodelixo = JOptionPane.showInputDialog("Quantos ?");
            double resultadosacodelixo = Double.parseDouble(quantossacodelixo);
            double valorsacodelixo = (resultadosacodelixo*3.29);
            System.out.println(resultadosacodelixo +"  Saco de lixo " + "O valor vai ser aproximadamente =  "+ valorsacodelixo);
        }

        int detergente = JOptionPane.showConfirmDialog(null, "Vai precisar de Detergente");
        if (detergente == 0) {
            String quantosdetergente = JOptionPane.showInputDialog("Quantos ?");
            double resultadodetergente = Double.parseDouble(quantosdetergente);
            double valordetergente = (resultadodetergente*1.59);
            System.out.println(resultadodetergente +"  detergente  " + "O valor vai ser aproximadamente =  "+ valordetergente);
        }

        int sabaoempo = JOptionPane.showConfirmDialog(null, "Vai precisar de Sabão em Pó");
        if (sabaoempo == 0) {
            String quantossabaoempo = JOptionPane.showInputDialog("Quantos ?");
            double resultadosabaoempo = Double.parseDouble(quantossabaoempo);
            double valorsabaoempo = (resultadosabaoempo*13);
            System.out.println(resultadosabaoempo +"  Sabão em pó  " + "O valor vai ser aproximadamente =  "+ valorsabaoempo);
        }
        int amaciante = JOptionPane.showConfirmDialog(null, "Vai precisar de Amaciante Roupas ");
        if (amaciante== 0) {
            String quantosamaciante = JOptionPane.showInputDialog("Quantos ?");
            double resultadoamaciante = Double.parseDouble(quantosamaciante);
            double valoramaciante = (resultadoamaciante*5.9);
            System.out.println(resultadoamaciante +"  Amaciante Roupas " + "O valor vai ser aproximadamente =  "+ valoramaciante);
        }
        int veja = JOptionPane.showConfirmDialog(null, "Vai precisar de Veja");
        if (veja== 0) {
            String quantosveja = JOptionPane.showInputDialog("Quantos ?");
            double resultadoveja = Double.parseDouble(quantosveja);
            double valorveja = (resultadoveja*3);
            System.out.println(resultadoveja +"  Veja    " + "O valor vai ser aproximadamente =  "+ valorveja);
        }
        int qboa = JOptionPane.showConfirmDialog(null, "Vai precisar de Qboa");
        if (qboa== 0) {
            String quantosqboa = JOptionPane.showInputDialog("Quantos ?");
            double resultadoqboa = Double.parseDouble(quantosqboa);
            double valorqboa = (resultadoqboa*2.2);
            System.out.println(resultadoqboa +"  Qboa  " + "O valor vai ser aproximadamente =  "+ valorqboa);
        }
        int lustra = JOptionPane.showConfirmDialog(null, "Vai precisar de Lustra Móveis");
        if (lustra== 0) {
            String quantoslustra = JOptionPane.showInputDialog("Quantos ?");
            double resultadolustra = Double.parseDouble(quantoslustra);
            double valorlustra = (resultadolustra*5);
            System.out.println(resultadolustra +"  Lustra Móveis   " + "O valor vai ser aproximadamente =  "+ valorlustra);
        }
        int limpapiso = JOptionPane.showConfirmDialog(null, "Vai precisar de Limpa Piso (AJAX) ");
        if (limpapiso== 0) {
            String quantoslimpapiso = JOptionPane.showInputDialog("Quantos ?");
            double resultadolimpapiso = Double.parseDouble(quantoslimpapiso);
            double valorlimpapiso= (resultadolimpapiso*3.5);
            System.out.println(resultadolimpapiso +"    Limpa Piso (AJAX) " + "O valor vai ser aproximadamente =  "+ valorlimpapiso );
        }
        int desinfetante = JOptionPane.showConfirmDialog(null, "Vai precisar de Desinfetante");
        if (desinfetante== 0) {
            String quantosdesinfetante = JOptionPane.showInputDialog("Quantos ?");
            double resultadodesinfetante = Double.parseDouble(quantosdesinfetante);
            double valordesinfetante = (resultadodesinfetante*1.9);
            System.out.println(resultadodesinfetante +"  Desinfetante   " + "O valor vai ser aproximadamente =  "+ valordesinfetante);
        }
        int caldococo = JOptionPane.showConfirmDialog(null, "Vai precisar de Caldo Knnor");
        if (caldococo== 0) {
            String quantoscaldococo = JOptionPane.showInputDialog("Quantos ?");
            double resultadocaldococo = Double.parseDouble(quantoscaldococo);
            double valorcaldococo = (resultadocaldococo*2.5);
            System.out.println(resultadocaldococo +"  Caldo Knnor     " + "O valor vai ser aproximadamente =  "+ valorcaldococo);
        }

        int pastadente = JOptionPane.showConfirmDialog(null, "Vai precisar de Pasta de dente");
        if (pastadente== 0) {
            String quantospastadente = JOptionPane.showInputDialog("Quantos ?");
            double resultadopastadente = Double.parseDouble(quantospastadente);
            double valorpastadente = (resultadopastadente*2.5);
            System.out.println(resultadopastadente +"  Pasta de dente     " + "O valor vai ser aproximadamente =  "+ valorpastadente);
        }

        int sabonete = JOptionPane.showConfirmDialog(null, "Vai precisar de Sabonete");
        if (sabonete== 0) {
            String quantossabonete = JOptionPane.showInputDialog("Quantos ?");
            double resultadosabonete = Double.parseDouble(quantossabonete);
            double valorsabonete= (resultadosabonete*1.3);
            System.out.println(resultadosabonete +"  Sabonete     " + "O valor vai ser aproximadamente =  "+ valorsabonete);
        }
        int miojo = JOptionPane.showConfirmDialog(null, "Vai precisar de Miojo");
        if (miojo== 0) {
            String quantosmiojo = JOptionPane.showInputDialog("Quantos ?");
            double resultadomiojo = Double.parseDouble(quantosmiojo);
            double valormiojo= (resultadomiojo*1.2);
            System.out.println(resultadomiojo +"  Miojo     " + "O valor vai ser aproximadamente =  "+ valormiojo);
        }

        int molhotomate = JOptionPane.showConfirmDialog(null, "Vai precisar de Molho Tomate");
        if (molhotomate== 0) {
            String quantosmolhotomate = JOptionPane.showInputDialog("Quantos ?");
            double resultadomolhotomate = Double.parseDouble(quantosmolhotomate);
            double valormolhotomate= (resultadomolhotomate*1.2);
            System.out.println(resultadomolhotomate +"  Molho Tomate  " + "O valor vai ser aproximadamente =  "+ valormolhotomate);
        }
        int leitecondensado = JOptionPane.showConfirmDialog(null, "Vai precisar de Leite Condensado");
        if (leitecondensado== 0) {
            String quantosleitecondensado = JOptionPane.showInputDialog("Quantos ?");
            double resultadoleitecondensado = Double.parseDouble(quantosleitecondensado);
            double valorleitecondensado= (resultadoleitecondensado*4.2);
            System.out.println(resultadoleitecondensado +"  Leite Condensado  " + "O valor vai ser aproximadamente =  "+ valorleitecondensado);
        }
        int cremedeleite = JOptionPane.showConfirmDialog(null, "Vai precisar de Creme de Leite");
        if (cremedeleite== 0) {
            String quantoscremedeleite = JOptionPane.showInputDialog("Quantos ?");
            double resultadocremedeleite = Double.parseDouble(quantoscremedeleite);
            double valorcremedeleite= (resultadocremedeleite*2.4);
            System.out.println(resultadocremedeleite +"  Creme de Leite    " + "O valor vai ser aproximadamente =  "+ valorcremedeleite);
        }
        int gelatina = JOptionPane.showConfirmDialog(null, "Vai precisar de Gelatina");
        if (gelatina== 0) {
            String quantosgelatina = JOptionPane.showInputDialog("Quantos ?");
            double resultadogelatina = Double.parseDouble(quantosgelatina);
            double valorgelatina= (resultadogelatina*1);
            System.out.println(resultadogelatina  +"  Gelatina    " + "O valor vai ser aproximadamente =  "+ valorgelatina);
        }
        int filtropapel = JOptionPane.showConfirmDialog(null, "Vai precisar de Filtro de Papel");
        if (filtropapel== 0) {
            String quantosfiltropapel = JOptionPane.showInputDialog("Quantos ?");
            double resultadofiltropapel = Double.parseDouble(quantosfiltropapel);
            double valorfiltropapel= (resultadofiltropapel*3.5);
            System.out.println(resultadofiltropapel +"  Filtro de Papel    " + "O valor vai ser aproximadamente =  "+ valorfiltropapel);
        }
        int leitejp = JOptionPane.showConfirmDialog(null, "Vai precisar de leite JP ninho");
        if (leitejp == 0) {
            String quantosleitejp = JOptionPane.showInputDialog("Quantos ?");
            double resultadoleitejp = Double.parseDouble(quantosleitejp);
            double valorleitejp= (resultadoleitejp*26.5);
            System.out.println(resultadoleitejp +"  leite JP Ninho    " + "O valor vai ser aproximadamente =  "+ valorleitejp);
        }
        int cafe = JOptionPane.showConfirmDialog(null, "Vai precisar de Café");
        if (cafe == 0) {
            String quantoscafe = JOptionPane.showInputDialog("Quantos ?");
            double resultadocafe = Double.parseDouble(quantoscafe);
            double valorcafe = (resultadocafe*8);
            System.out.println(resultadocafe +"  Café    " + "O valor vai ser aproximadamente =  "+ valorcafe);
        }
        int margarina = JOptionPane.showConfirmDialog(null, "Vai precisar de Margarina");
        if (margarina == 0) {
            String quantosmargarina = JOptionPane.showInputDialog("Quantos ?");
            double resultadomargarina = Double.parseDouble(quantosmargarina);
            double valormargarina= (resultadomargarina*6.5);
            System.out.println(resultadomargarina +"  Margarina    " + "O valor vai ser aproximadamente =  "+ valormargarina);
        }

        int pao = JOptionPane.showConfirmDialog(null, "Vai precisar de pão");
        if (pao == 0) {
            String quantospao = JOptionPane.showInputDialog("Quantos ?");
            double resultadopao = Double.parseDouble(quantospao);
            double valorpao= (resultadopao*4.9);
            System.out.println(resultadopao +"  pão    " + "O valor vai ser aproximadamente =  "+ valorpao);
        }

        int leitejpo = JOptionPane.showConfirmDialog(null, "Vai precisar de leite JP saquinho");
        if (leitejpo == 0) {
            String quantosleitejpo = JOptionPane.showInputDialog("Quantos ?");
            double resultadoleitejpo = Double.parseDouble(quantosleitejpo);
            double valorleitejpo= (resultadoleitejpo*2.99);
            System.out.println(resultadoleitejpo +"  leite JP Saquinho    " + "O valor vai ser aproximadamente =  "+ valorleitejpo);
        }

        int leite = JOptionPane.showConfirmDialog(null, "Vai precisar de leite caixinha");
        if (leite == 0) {
            String quantosleite = JOptionPane.showInputDialog("Quantos ?");
            double resultadoleite = Double.parseDouble(quantosleite);
            double valorleite= (resultadoleite*3.5);
            System.out.println(resultadoleite +"  leite caixinha    " + "O valor vai ser aproximadamente =  "+ valorleite);
        }

        int calabresa = JOptionPane.showConfirmDialog(null, "Vai precisar de Calabresa  ");
        if (calabresa == 0) {
            String quantoscalabresa = JOptionPane.showInputDialog("Quantos ?");
            double resultadocalabresa = Double.parseDouble(quantoscalabresa);
            double valorcalabresa= (resultadocalabresa*8.5);
            System.out.println(resultadocalabresa +"  Calabresa      " + "O valor vai ser aproximadamente =  "+ valorcalabresa);
        }

        int iogurte = JOptionPane.showConfirmDialog(null, "Vai precisar de Iogurte");
        if (iogurte == 0) {
            String quantosiogurte = JOptionPane.showInputDialog("Quantos ?");
            double resultadoiogurte = Double.parseDouble(quantosiogurte);
            double valoriogurte = (resultadoiogurte*1.9);
            System.out.println(resultadoiogurte +"  Iogurte    " + "O valor vai ser aproximadamente =  "+ valoriogurte);
        }

        int chamyto = JOptionPane.showConfirmDialog(null, "Vai precisar de Chamyto");
        if (chamyto == 0) {
            String quantoschamyto = JOptionPane.showInputDialog("Quantos ?");
            double resultadochamyto = Double.parseDouble(quantoschamyto);
            double valorchamyto= (resultadochamyto*3.5);
            System.out.println(resultadochamyto +"  Chamyto   " + "O valor vai ser aproximadamente =  "+ valorchamyto);
        }

        int frios = JOptionPane.showConfirmDialog(null, "Vai precisar de Frios");
        if (frios == 0) {
            String quantosfrios = JOptionPane.showInputDialog("Quantos ?");
            double resultadofrios = Double.parseDouble(quantosfrios);
            double valorfrios= (resultadofrios*20);
            System.out.println(resultadofrios +"  Frios    " + "O valor vai ser aproximadamente =  "+ valorfrios);
        }

        int filefrango = JOptionPane.showConfirmDialog(null, "Vai precisar de Filé de Frango");
        if (filefrango == 0) {
            String quantosfilefrango = JOptionPane.showInputDialog("Quantos ?");
            double resultadofilefrango = Double.parseDouble(quantosfilefrango);
            double valorfilefrango= (resultadofilefrango*6.9);
            System.out.println(resultadofilefrango +"  Filé de Frango       " + "O valor vai ser aproximadamente =  "+ valorfilefrango);
        }

        int ovo = JOptionPane.showConfirmDialog(null, "Vai precisar de Ovo");
        if (ovo == 0) {
            String quantosovo = JOptionPane.showInputDialog("Quantos ?");
            double resultadoovo = Double.parseDouble(quantosovo);
            double valorovo= (resultadoovo*11.9);
            System.out.println(resultadoovo +"  Ovo       " + "O valor vai ser aproximadamente =  "+ valorovo);
        }



    }


}
