@RestController
@RequestMapping("/platos")
public class PlatoController {
    @Autowired
    private PlatoRepository repo;

    @GetMapping("/{id}")
    public ResponseEntity<Plato> getPlato(@PathVariable String id) {
        return repo.findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.status(404).body(null));
    }
}
