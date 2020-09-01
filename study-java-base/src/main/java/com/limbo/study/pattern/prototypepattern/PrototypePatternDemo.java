package com.limbo.study.pattern.prototypepattern;

import com.alibaba.fastjson.JSONObject;

import java.io.IOException;

/**
 * PrototypePatternDemo
 *
 * @author limbo
 * Date: 2019/8/29 10:34
 */
public class PrototypePatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Prototype prototype = new Prototype();
        SerializableObject pObject = new SerializableObject();
        prototype.setString("TEST_123");
        prototype.setObj(pObject);
        System.out.println("原数据" + JSONObject.toJSONString(prototype));
        Prototype prototypeCloneObjec = (Prototype)prototype.clone();
        System.out.println("浅复制" + JSONObject.toJSONString(prototypeCloneObjec));
        Prototype prototypeDeepCloneObjec = (Prototype)prototype.deepClone();
        System.out.println("深复制" + JSONObject.toJSONString(prototypeDeepCloneObjec));

        System.out.println("设置值#########################");
        prototypeCloneObjec.setString("TEST_345");
        System.out.println("原数据" + JSONObject.toJSONString(prototype));
        System.out.println("浅复制" + JSONObject.toJSONString(prototypeCloneObjec));
        System.out.println("深复制" + JSONObject.toJSONString(prototypeDeepCloneObjec));
    }
}
