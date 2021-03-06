package io.scalecube.services.transport.api;

import io.scalecube.services.api.ServiceMessage;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Client channel interface. */
public interface ClientChannel {

  Mono<ServiceMessage> requestResponse(ServiceMessage message);

  Flux<ServiceMessage> requestStream(ServiceMessage message);

  Flux<ServiceMessage> requestChannel(Publisher<ServiceMessage> publisher);
}
