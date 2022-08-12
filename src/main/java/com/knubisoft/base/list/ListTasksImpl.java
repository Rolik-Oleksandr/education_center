package com.knubisoft.base.list;

import java.util.*;


public class ListTasksImpl implements ListTasks {
    @Override
    public List<String> addElements(String[] elements) {
        return List.of(elements);
    }

    @Override
    public List<String> getElementsByIndexes(List<String> elements, int[] indexes) {
        if (indexes == null){
            throw new IllegalArgumentException();
        }
        for(int index: indexes){
            if(index < 0 ||index == Integer.MAX_VALUE){
                throw new IllegalArgumentException();
            }
            elements.add(elements.get(index));
        }

        return elements;
    }

    @Override
    public ArrayList<String> addElementsByIndexes(ArrayList<String> elements, int[] indexes) {
        if(indexes == null){
            throw new IllegalArgumentException();
        }
        for(int index : indexes){
            if (index < 0 || index == Integer.MAX_VALUE){
                throw new IllegalArgumentException();
            }
            elements.add(index, elements.get(index));
        }
        return elements;
    }

    @Override
    public LinkedList<String> setElementsByIndexes(LinkedList<String> elements, int[] indexes) {
        if(indexes == null){
            throw new IllegalArgumentException();
        }
        for (int index : indexes){
            if (index < 0 || index == Integer.MAX_VALUE){
                throw new IllegalArgumentException();
            }
            elements.set(index, elements.get(index));
        }
        return elements;
    }

    @Override
    public int getListSize(List<String> list) {
        return list == null ? 0 : list.size();
    }

    @Override
    public List<Long> merge(List<Integer> first, List<Long> second, List<String> third) {
        List<Long> merge = new ArrayList<>();
        for(Integer f : first){
            merge.add(Long.valueOf(f));
            }
        merge.addAll(second);
        for (String th : third) {
            if (th == null) {
                throw new NullPointerException();
            }
            merge.add(Long.parseLong(th));
        }
        return merge;
    }

    @Override
    public int findMaxValue(List<Integer> first, List<Integer> second, List<Integer> third) {
        List<Integer> merge = new ArrayList<>(first);
        merge.addAll(second);
        merge.addAll(third);
//        int max = merge.get(0);
//        for (int index : merge){
//            if(max < index){
//                max = index;
//            }
//        }
//        return max;
        return Collections.max(merge);
    }

    @Override
    public int findMinValue(List<Integer> first, List<Integer> second, List<Integer> third) {
        List<Integer> merge = new ArrayList<>(first);
        merge.addAll(second);
        merge.addAll(third);
//        int min = merge.get(0);
//        for (int index : merge){
//            if(min > index){
//                min = index;
//            }
//        }
//        return max;
        return Collections.min(merge);
    }

    @Override
    public int multiplyMax2Elements(List<Integer> first, List<Integer> second, List<Integer> third) {
        return -1;
    }

    @Override
    public List<String> removeNulls(List<String> list) {
        if (list == null){
            throw new NullPointerException();
        }
        List<String> arr = new ArrayList<>();
        for(String index : list){
            if(index != null){
                arr.add(index);
            }
        }
        return arr;
    }

    @Override
    public List<Integer> flatMapWithoutNulls(List<List<Integer>> list) {
        // task with using stream API
        // return when learned stream API
        return null;
    }

    @Override
    public List<Integer> cloneIds(List<Integer> originalIds) {
        if(originalIds == null){
            throw new NoSuchElementException();
        }
        List<Integer> cloneList = new ArrayList<>();
        for(Integer index: originalIds){
            if(index != null){
                cloneList.add(index);
            }
        }
        return cloneList;
    }

    @Override
    public List<String> shuffle(List<String> originalStrings) {
        if(originalStrings == null){
            throw new NoSuchElementException();
        }
        List<String> shuffle = new ArrayList<>();
        Collections.shuffle(shuffle);
        return shuffle;
    }

    @Override
    public String getLastElement(LinkedList<String> list) {
        if(list == null){
            throw new NoSuchElementException();
        }
        if(list.isEmpty()){
            return "";
        }
        return list.getLast();
    }

    @Override
    public List<String> compareElements(LinkedList<String> originalCollection, LinkedList<String> additionalCollection) {
        if(originalCollection == null || additionalCollection== null){
            throw new IllegalArgumentException();
        }
        List<String> merge = new LinkedList<>();
        for(int i = 0; i < originalCollection.size(); i++){
            for (int j = 0; j < additionalCollection.size(); j++){
                if(originalCollection.get(i).equals(additionalCollection.get(j))){
                    merge.add(originalCollection.get(i));
                }
            }
        }
        return merge;
    }
}
