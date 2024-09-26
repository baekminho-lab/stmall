package stmall.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import stmall.domain.*;

@Component
public class OderHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Oder>> {

    @Override
    public EntityModel<Oder> process(EntityModel<Oder> model) {
        return model;
    }
}
