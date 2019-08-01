package movies;

public class Movie {
    private String name;
    private String category;
    public Movie(String name,String cat){
        this.name = name;
        this.category = cat;
    };
//    private void setMovie(String name,String cat){
//        this.name = name;
//        this.category = cat;
////    }
    public String getMovie(Movie[] array){
        return ""+this.name+" "+this.category+"";
    }



}
