package com.example.swappifyauthconnector.connector;

import com.example.swappifyapimodel.model.dto.ItemDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "itemConnector",
        url = "${swappify.front-api}",
        path = "/item"
)
public interface ItemConnector {
    @PostMapping(path = "/add")
    ResponseEntity<Void> addItemMetadata(@RequestHeader(HttpHeaders.AUTHORIZATION) @NonNull String token,
                                         @RequestBody final @NonNull ItemDTO item);

    @GetMapping(path = "/all")
    List<ItemDTO> getAll(@RequestHeader(HttpHeaders.AUTHORIZATION) @NonNull String token);

    @GetMapping("/matched/{itemUuid}")
    List<ItemDTO> getMatchedItems(@RequestHeader(HttpHeaders.AUTHORIZATION) @NonNull String token, @PathVariable @NonNull String itemUuid);

    @GetMapping("/like/{itemUuid}")
    List<ItemDTO> getLikedItems(@RequestHeader(HttpHeaders.AUTHORIZATION) @NonNull String token, @PathVariable("itemUuid") @NonNull String itemUuid);

    @GetMapping("/match/{itemUuid}")
    List<ItemDTO> getMatchedItemsForSpecific(@RequestHeader(HttpHeaders.AUTHORIZATION) @NonNull String token,
                                         @PathVariable("itemUuid") @NonNull String itemUuid);


}

