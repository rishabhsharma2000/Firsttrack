import java.util.*;

class Maplistcreation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of maps you want to create");
        int noOfMap = sc.nextInt();
        List<HashMap<String, Integer>> listOfMaps = new ArrayList<>();
        for (int i = 1; i <= noOfMap; i++) {

            System.out.println("Enter " + i + " Student  Name");
            String name = sc.next();
            System.out.println("Enter Value");
            int marks = sc.nextInt();

            listOfMaps.add(mapCreation(name, marks));

        }
        System.out.println(listOfMaps);
        for (int i = 0; i < listOfMaps.size(); i++) {
            for (int j = i + 1; j < listOfMaps.size(); j++) {
                String first = (String) listOfMaps.get(i).keySet().toArray()[0];
                String second = (String) listOfMaps.get(j).keySet().toArray()[0];
                if (first.compareTo(second) > 0) {
                    HashMap<String, Integer> temp = listOfMaps.get(i);
                    listOfMaps.set(i, listOfMaps.get(j));
                    listOfMaps.set(j, temp);

                }
            }
        }
        System.out.println("List of Maps"+listOfMaps);

    }

    public static HashMap<String, Integer> mapCreation(String name, Integer marks) {
        HashMap<String, Integer> createdMap = new HashMap<>();
        createdMap.put(name, marks);
        // System.out.println(createdMap);
        return createdMap;
    }

}