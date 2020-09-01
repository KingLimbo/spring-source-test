package com.limbo.learning.pattern.adapterPattern;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * AdapterTest: 测试类
 *
 * @author limbo
 * Date: 2019/8/30 16:32
 */
public class AdapterTest {

    @Test
    public void showAdapterDemo(){
        Adapter adapter = new Adapter();
        adapter.showMessage();
        adapter.showTable();
    }
}