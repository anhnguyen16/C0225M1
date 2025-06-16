package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/30
 * Time: 16:33
 * LinkedList doi (Doubly LinkedList)
 */
public class DoublySongNode {
    private String songName;
    DoublySongNode next;
    DoublySongNode prev;

    public DoublySongNode(String songName) {
        this.songName = songName;
        this.next = null;
        this.prev = null;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
}
