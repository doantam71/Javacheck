package movietheater;

public class movie {
    int id;
    String nameMovie;
    String category;
    String country;
    int trend;

    public movie(){

    }
    public movie(int id, String nameMovie, String category, String country, int trend) {
        this.id = id;
        this.nameMovie = nameMovie;
        this.category = category;
        this.country = country;
        this.trend = trend;
    }

    public int getid(){
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }
    public String getNameMovie(){
        return nameMovie;
    }
    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getTrend(){
        return trend;
    }
    public void setTrend(int trend) {
        this.trend = trend;
    }
    //

}

