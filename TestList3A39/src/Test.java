import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
      ArrayList arr=new ArrayList();

      arr.add("test");

      arr.add(5);
      arr.add(6.3);
      arr.add(9);
      arr.add("A39");
      arr.add("test");
      arr.add(5);
        System.out.println(arr);
        System.out.println(arr.size());

      System.out.println(arr.contains(5));
      System.out.println(arr.contains("A39"));
      System.out.println(arr.remove(5));
      Integer a=5;
      System.out.println(arr);
      System.out.println(arr.remove(a));
      System.out.println(arr);

      Object val=arr.get(2);
      System.out.println(val);
     for(int i=0;i<arr.size();i++)
     {
       Object ob=arr.get(i);
       System.out.println(ob);
     }
     for(Object ab1:arr)
       System.out.println(ab1);

     Personne p1=new Personne(1,"nom1","prenom1",12);
     Personne p2=new Personne(2,"nom2","prenom2",17);
     Personne p3=new Personne(3,"nom3","prenom3",15);
        Personne p4=new Personne(3,"nom3","prenom3",15);
     arr.add(p1);
     arr.add(p2);
arr.add(p3);

        System.out.println(arr);

        for(int i=0;i<arr.size();i++)
        {
            Object ob=arr.get(i);
            System.out.println(ob);
        }

        //afficher que les noms des personnes

        for(int i=0;i<arr.size();i++)
        {if(arr.get(i) instanceof Personne) {
            Personne p = (Personne) arr.get(i);
            System.out.println("nom :"+p.getNom());
        }
        }

        ArrayList<Personne> lisper=new ArrayList();
        lisper.add(p1);
        lisper.add(p2);
        lisper.add(p3);

        System.out.println(lisper.contains(p1));

        System.out.println(lisper.contains(p4));
        System.out.println(lisper.contains(new Personne(2,"nom2","prenom2",17)));
        System.out.println(lisper.remove(p4));
    Personne ens=new Etudiant(1,"nom1","prenom1",12);
    Personne et=new Enseigant(1,"nom1","prenom1",15);
        System.out.println("test equals");
        System.out.println(ens.equals(et));

        //ArrayList de integer trier croissant et decroissant
        //ArrayList de string trie croissant et decroissant
        //ArrayList de personne
        

    }
}
