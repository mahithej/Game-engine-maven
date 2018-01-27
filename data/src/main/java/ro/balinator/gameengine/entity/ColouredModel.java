package ro.balinator.gameengine.entity;

import lombok.Getter;
import ro.balinator.gameengine.entity.model.RawModel;

/**
 * Created by Balinator on 2018. 01. 27..
 */
@Getter
public class ColouredModel {
    private RawModel rawModel;

    public ColouredModel(RawModel rawModel) {
        this.rawModel = rawModel;
    }
}
