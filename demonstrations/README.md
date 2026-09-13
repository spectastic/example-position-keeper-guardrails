# Demonstrations — the seven behaviors, against feature 7

Every command is reproducible from the repo root. The outputs here are real tool output, committed so a
reader can check every claim offline. The guardrail tooling is specs 112–117 of the spectastic meta-repo.

| # | Behavior | Evidence |
|---|----------|----------|
| 1 | Happy path — plan surfaces ADR-0007 via scoped retrieval | `1-happy-retrieval.txt`, `1-retrieval-log.json` |
| 2 | Forced bypass, caught at plan (design omits the acknowledgment) | `2-plan-bypass.txt` |
| 3 | Forced bypass, caught at merge (direct `UPDATE positions`) | `3-merge-bypass.txt`, `3-verdict.json` |
| 4 | The residual case — allowed adapter passes; ArchUnit finding via SARIF | `4-residual.txt`, `4a`/`4b` |
| 5 | Coverage report — the DB grant is a `none`-with-reason | `5-coverage.txt` |
| 6 | Vendor neutrality — the verdict is a plain artifact | `6-vendor-neutrality.md` |
| 7 | Teaching on failure — one Socratic question, never a fix | `7-teaching.txt`, `7-verdict.json` |

Demo 4 shows the detector/explainer split: spectastic's own content detector *and* ArchUnit's
type-graph finding (ingested from SARIF, never run by spectastic) both compose the **same** decision's
reason; demo 4a shows the sanctioned adapter's identical SQL is silent because it is in the allowed path.
