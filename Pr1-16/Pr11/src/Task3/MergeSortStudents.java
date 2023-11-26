package Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MergeSortStudents {

    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> merged = new ArrayList<>(list1);
        merged.addAll(list2);

        if (merged.size() <= 1) {
            return merged;
        }

        int mid = merged.size() / 2;
        List<Student> left = merged.subList(0, mid);
        List<Student> right = merged.subList(mid, merged.size());

        left = mergeSort(left, new ArrayList<>());
        right = mergeSort(right, new ArrayList<>());

        return merge(left, right);
    }

    public static List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> merged = new ArrayList<>();
        Iterator<Student> leftIter = left.iterator();
        Iterator<Student> rightIter = right.iterator();

        Student leftStudent = null;
        Student rightStudent = null;

        while (leftIter.hasNext() && rightIter.hasNext()) {
            if (leftStudent == null) {
                leftStudent = leftIter.next();
            }
            if (rightStudent == null) {
                rightStudent = rightIter.next();
            }

            if (leftStudent.getID() < rightStudent.getID()) {
                merged.add(leftStudent);
                leftStudent = null;
            } else {
                merged.add(rightStudent);
                rightStudent = null;
            }
        }

        while (leftStudent != null) {
            merged.add(leftStudent);
            if (leftIter.hasNext()) {
                leftStudent = leftIter.next();
            } else {
                leftStudent = null;
            }
        }

        while (rightStudent != null) {
            merged.add(rightStudent);
            if (rightIter.hasNext()) {
                rightStudent = rightIter.next();
            } else {
                rightStudent = null;
            }
        }

        return merged;
    }
}
