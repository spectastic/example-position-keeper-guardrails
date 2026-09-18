package xyz.briancorbin.pk.recon;

import java.util.List;

/** The custodian's end-of-day file, parsed. */
public record CustodianFile(List<CustodianRecord> records) {}
