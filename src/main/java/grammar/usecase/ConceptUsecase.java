package grammar.usecase;
import java.util.List;
import grammar.model.ConceptModel;

interface ConceptUsecase {
    List<ConceptModel> conceptsByTagName(String tagName);
}