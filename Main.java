import java.util.HashMap;
import java.util.Set;
public class TrackList{
    public static void trackList(){
        HashMap<String, String> music = new HashMap<String, String>();
        music.put("Yeah!", "Yeah, yeah, yeah, yeah, yeah, yeah");
        music.put("Peace sign", "I ain't tryna you out");
        music.put("You make me wanna", "You make me wanna leave the one im with");
        music.put("Cranes in the sky", "Well its like cranes in the sky");
        Set<String> keys = music.keySet();
        System.out.println("The lyrics for Cranes in the sky are: "+music.get("Cranes in the sky"));
        for(String key : keys){
            System.out.println(key+": "+music.get(key));
        }
    }
    public static void main(String[] args){
        trackList();
    }
}