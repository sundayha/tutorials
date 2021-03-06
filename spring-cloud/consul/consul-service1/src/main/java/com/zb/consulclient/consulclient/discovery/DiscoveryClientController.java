package com.zb.consulclient.consulclient.discovery;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author 张博【zhangb@lianliantech.cn】
 */
@RestController
public class DiscoveryClientController {

    @RequestMapping(value = "/discoveryPingForGet/{name}", method = RequestMethod.GET)
    public String discoveryPingForGet(@PathVariable("name") String name) {
        return "pong 8000->".concat(name);
    }

    @RequestMapping(value = "/discoveryPingForPost", method = RequestMethod.POST)
    public String discoveryPingForPost(@RequestBody User user) {
        return "pong 8000->".concat(user.getName());
    }

    @GetMapping("/myHealthCheck")
    public ResponseEntity<String> myCustomCheck() {
        String message = "Testing my healh check function";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
