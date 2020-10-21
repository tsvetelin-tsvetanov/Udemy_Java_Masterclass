import java.util.ArrayList;
import java.util.List;

public class Album {
    private String albumName;
    private String artist;
    private SongList songs;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new SongList();
    }

    public String getAlbumName() {
        return albumName;
    }

    public boolean addSong(String title, double duration){
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlaylist(int trackNumber, List<Song> playlist){
        Song checkedSong = this.songs.findSong(trackNumber);

        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, List<Song> playlist){
        Song checkedSong = songs.findSong(title);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean add (Song song){
            if(songs.contains(song)){
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title){
            for (Song song : this.songs) {
                if(song.getTitle().equals(title)){
                    return song;
                }
            }
            return null;
        }
        public Song findSong (int trackNumber){
            int index = trackNumber - 1;
            if((index > 0) && (index < songs.size())){
                return songs.get(index);
            }
            return null;
        }
    }
}
