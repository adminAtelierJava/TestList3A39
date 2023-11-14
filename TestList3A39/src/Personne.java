public class Personne {
    private int id;
    private String nom,prenom;
    private int age;


    public Personne(int id,String n,String p,int age)
    {
        this.id=id;
        nom=n;
        prenom=p;
        this.age=age;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString()
    {
        return "id :"+id+"nom :"+nom+" prenom :"
                +prenom+" age :"+age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this)return true;
        if(obj==null) return false;
        if(obj.getClass()==this.getClass())
        {
            Personne p=(Personne)obj;
            if(p.id==id &&p.nom.equals(nom))
                return true;
        }
        return false;
    }
}
