package com.wieczorek.jan.composite.pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent{

    ArrayList songComponents = new ArrayList();

    String groupName;
    String groupDescription;

    public SongGroup(String newGroupName, String newGroupDescription){
        this.groupDescription = newGroupDescription;
        this.groupName = newGroupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void addSongComponent (SongComponent newSongComponent){
        songComponents.add(newSongComponent);
    }

    public void removeSongComponent (SongComponent newSongComponent){
        songComponents.remove(newSongComponent);
    }

    public SongComponent getSongComponent(int componentIndex) {
        return (SongComponent)songComponents.get(componentIndex);
    }


    public void displaySongInfo(){
        System.out.println(this.getGroupName() + " "+ this.getGroupDescription());

        Iterator songIterator = songComponents.iterator();

        while(songIterator.hasNext()){
            SongComponent songInfo = (SongComponent) songIterator.next();
            songInfo.displaySongInfo();
        }
    }
}
