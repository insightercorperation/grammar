package grammar.usecase;
import grammar.model.ConceptModel;
import java.util.List;
import java.util.ArrayList;

public class SampleConceptUsecase implements ConceptUsecase {
    public List<ConceptModel> conceptsByTagName(String tagName) {
        ConceptModel d1 = new ConceptModel(
            "동사 vs 명사",
            "동사 명사에 대한 설명입니다.",
            new String[] {"동사", "명사"}
        );

        ConceptModel d2 = new ConceptModel(
            "동사 vs 명사",
            "동사 명사에 대한 설명입니다.",
            new String[] {"동사", "명사"}
        );

        ConceptModel d3 = new ConceptModel(
            "동사 vs 명사",
            "동사 명사에 대한 설명입니다.",
            new String[] {"동사", "명사"}
        );

        List<ConceptModel> rv = new ArrayList<>();
        rv.add(d1);
        rv.add(d2);
        rv.add(d3);

        return rv;
    }
}