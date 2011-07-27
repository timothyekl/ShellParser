package com.lithium3141.shellparser.states;

import java.util.List;

import com.lithium3141.shellparser.ParseException;

public abstract class State {
    public abstract List<String> parse(String parsing, String accumulator, List<String> parsed, State referrer) throws ParseException;
}
