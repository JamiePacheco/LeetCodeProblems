package Problems.ArraysHashing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EncodeDecode {

    public String encode(List<String> strs) {
        return strs.size() == 0 ? strs.stream().collect(Collectors.joining("#")) : "";
    }

    public List<String> decode(String str) {
        return  List.of(str.isBlank() ? str.split("#") : null);
    }
}
