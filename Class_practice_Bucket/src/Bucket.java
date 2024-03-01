public class Bucket {
    private String Material;
    private int Currentvolume;
    private boolean full;

    public Bucket(String Material){
        Material = this.Material;
        Currentvolume = this.Currentvolume;
    }

    public int getcurrentvolume(){
        return this.Currentvolume;
    }
    public String getmaterial(){
        return this.Material;
    }
    public boolean full(){
        return this.full;
    }

}
