package com.vinicius_grandi.chapter3;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

interface Query {
    void from(Machine m) throws IOException;
}

public class Report {
    public static void report(Writer out, List<Machine> machines, Robot robot) throws IOException {
        writeHeader(out);
        writeFactorySection(out, machines);
        writeRobotSection(out, robot);
        writeFooter(out);
    }

    private static void writeFooter(Writer out) throws IOException {
        out.write("========\n");
    }

    private static void writeHeader(Writer out) throws IOException {
        out.write("FACTORY REPORT\n");
    }

    private static void writeRobotSection(Writer out, Robot robot) throws IOException {
        out.write("Robot");
        if (robot.location() != null) out.write(" location=" + robot.location().name());
        if (robot.bin() != null) out.write(" bin=" + robot.bin());
        out.write("\n");
    }

    private static void writeFactorySection(Writer out, List<Machine> machines) throws IOException {
        Query writeBin = (machine) -> out.write(" bin=" + machine.bin());

        for (Machine machine : machines) {
            out.write("Machine " + machine.name());
            if (machine.bin() != null) writeBin.from(machine);
            out.write("\n");
        }
        out.write("\n");
    }
}
