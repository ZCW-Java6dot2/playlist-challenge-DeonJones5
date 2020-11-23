package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        if (findSongScrollUp(startIndex, selection) > findingSongScrollDown(startIndex, selection)){
            return findingSongScrollDown(startIndex, selection);
        }

        return findSongScrollUp(startIndex, selection);

    }

    public Integer findSongScrollUp(Integer startIndex, String selection){
        Integer counter = 0;
        for (int i = startIndex; i < playList.length; i++,counter++) {
            if (playList[i].equals(selection)){
                return counter;
            }

        }

        return null;
    }

    public Integer findingSongScrollDown(Integer startIndex, String selection){
        Integer counter = 0;

        for (int i = startIndex; i >= 0; i--,counter++) {


                if (playList[i].equals(selection)) {
                    return counter;
                }

                if(i-1 == -1) {i = playList.length-1; counter++;}

            if (playList[i].equals(selection)) {
                return counter;
            }
        }
        return null;
    }
}


