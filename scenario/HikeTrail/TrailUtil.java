package first.src.scenario.HikeTrail;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TrailUtil {
    private List<Trail> trailList = new ArrayList<>();

    public void setTrailList(List trailList) {
        this.trailList = trailList;
    }

    public List getTrailList() {
        return trailList;
    }

    public void addTrailRecord(Trail trail){
        trailList.add(trail);
    }

    public Trail getTrailById(String trailId){
        for (Trail t:trailList){
            if(t.getTrailId().equals(trailId)){
                return t;
            }

        }
        return null;
    }

    public Set<Trail> getMostHikedTrails(){
        Set<Trail> result = new LinkedHashSet<>();

        int max = 0;
        for(Trail t:trailList){
            if(t.getHikeCount()>max){
                max = t.getHikeCount();
            }
        }

        for(Trail t:trailList){
            if(t.getHikeCount() == max){
                result.add(t);
            }
        }

        return result;
    }
}
