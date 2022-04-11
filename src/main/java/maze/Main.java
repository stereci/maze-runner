package maze;

import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultUndirectedGraph;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> dataList = loadData();
        List<Cell> cells = turnToCells(dataList);
        StringBuilder sb = new StringBuilder();
        Cell exitCell = findExitCell(cells);
        Cell entryCell = findEntryCell(cells);
        System.out.println("EntryCell: " + entryCell);
        System.out.println("ExitCell: " + exitCell);

        DefaultUndirectedGraph<Integer, DefaultEdge> graph = new DefaultUndirectedGraph<>(DefaultEdge.class);

        cells.forEach(cell -> {
            graph.addVertex(cell.getIndex());
        });

        cells.forEach(cell -> {
            if (cell.isTop() == false && graph.containsVertex(cell.getIndex() - 40)) {
                graph.addEdge(cell.getIndex(), cell.getIndex() - 40);
            }
            if (cell.isBottom() == false && graph.containsVertex(cell.getIndex() + 40)) {
                graph.addEdge(cell.getIndex(), cell.getIndex() + 40);
            }

            if (cell.isLeft() == false && graph.containsVertex(cell.getIndex() - 1)) {
                graph.addEdge(cell.getIndex(), cell.getIndex() - 1);
            }

            if (cell.isRight() == false && graph.containsVertex(cell.getIndex() + 1)) {
                graph.addEdge(cell.getIndex(), cell.getIndex() + 1);
            }
        });

        DijkstraShortestPath dijkstraShortestPath
                = new DijkstraShortestPath(graph);
        List<Integer> shortestPath = dijkstraShortestPath
                .getPath(entryCell.getIndex(), exitCell.getIndex()).getVertexList();

        for (Integer path : shortestPath) {
            for (Cell cell : cells) {
                if (path == cell.getIndex()) {
                    sb.append(cell.getWord().trim());
                }
            }
        }

        System.out.println(sb.toString());
    }

    public static Cell findExitCell(List<Cell> cells) {
        for (int i = cells.size() - 40; i < cells.size(); i++) {
            Cell cell = cells.get(i);
            if (cell.isBottom() == false) {
                return cell;
            }
        }
        return null;
    }

    public static Cell findEntryCell(List<Cell> cells) {
        for (int i = 0; i < 40; i++) {
            Cell cell = cells.get(i);
            if (cell.isTop() == false) {
                return cell;
            }
        }
        return null;
    }

    public static List<Cell> turnToCells(List<String> dataList) {
        List<Cell> cells = new ArrayList<>();
        for (int i = 1; i < dataList.size(); i++) {
            String[] strArray = dataList.get(i).split("");
            boolean top = strArray[0].equals("0") ? false : true;
            boolean right = strArray[1].equals("0") ? false : true;
            boolean bottom = strArray[2].equals("0") ? false : true;
            boolean left = strArray[3].equals("0") ? false : true;
            String word = strArray[4];

            Cell cell = new Cell(top, right, bottom, left, word, i);
            cells.add(cell);
        }
        return cells;
    }

    public static List<String> loadData() {
        List<String> dataList = new ArrayList<>();
        String fileName = "src/main/resources/mazenewhinted.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName, StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                dataList.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataList;
    }


}
