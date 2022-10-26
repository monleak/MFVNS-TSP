package main;

import basic.Individual;
import basic.Params;
import basic.TSP_Population;
import benchmark.Graph;
import benchmark.Problem;

import java.io.File;
import java.util.Random;

import static IO.DataIO.readDataTSP;

public class Main {
    public static void main(String[] args) {
        Problem prob = new Problem();
//        for(int testCase = 0;testCase<prob.testCase.size();testCase++){
//            for (int seed = 0;seed < Params.REPT;seed++){
//                Params.rand = new Random(seed);
//
//            }
//        }

        Params.rand = new Random();
        TSP_Population pop = new TSP_Population(prob,0);
        pop.init();
        pop.update();
    }
}