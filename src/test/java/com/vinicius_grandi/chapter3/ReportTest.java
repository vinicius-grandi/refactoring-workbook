package com.vinicius_grandi.chapter3;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReportTest {
    @Test
    public void testReport() throws IOException {
        ArrayList<Machine> line = new ArrayList<>();
        line.add(new Machine("mixer", "left"));
        Machine extruder = new Machine("extruder", "center");
        extruder.put("paste");
        line.add(extruder);
        Machine oven = new Machine("oven", "right");
        oven.put("chips");
        line.add(oven);
        Robot robot = new Robot();
        robot.moveTo(extruder);
        robot.pick();
        StringWriter out = new StringWriter();
        Report.report(out, line, robot);
        String expected =
                """
                        FACTORY REPORT
                        Machine mixer
                        Machine extruder
                        Machine oven bin=chips

                        Robot location=extruder bin=paste
                        ========
                        """;
        assertEquals(expected, out.toString());
    }
}