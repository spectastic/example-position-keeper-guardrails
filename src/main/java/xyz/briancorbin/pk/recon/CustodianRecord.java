package xyz.briancorbin.pk.recon;

/** One line of the custodian's end-of-day file: the quantity they hold for an instrument. */
public record CustodianRecord(String instrument, long quantity) {}
