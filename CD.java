public class CD {

    private String name;
    private String artist;
    private String yearReleased;
    private String recordLabel;

    public CD (String name, String artist, String yearReleased, String recordLabel) {
        this.name = name;
        this.artist = artist;
        this.yearReleased = yearReleased;
        this.recordLabel = recordLabel;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public void setYearReleased(String yearReleased){
        this.yearReleased = yearReleased;
    }

    public void setRecordLabel(String recordLabel){
        this.recordLabel = recordLabel;
    }

    public String getName(){
        return name;
    }

    public String getArtist(){
        return artist;
    }

    public String getYearReleased(){
        return yearReleased;
    }

    public String getRecordLabel(){
        return recordLabel;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CD) {
            CD cd = (CD) o;
            if (name.equals(cd.name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "Album: " + name + "\n" + "Artist: " + artist + "\n" + "Year Released: " + yearReleased +
                "\n" + "Record Label: " + recordLabel + "\n";
    }

}
