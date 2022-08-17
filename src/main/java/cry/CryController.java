package cry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CryController {

    @Autowired
    private CryCounterService cryCounterService;

    @GetMapping("/cry")
    public String cry(@RequestParam(name="name", required = false,
            defaultValue = "World") String name, Model model) {
        name = "Mariia";
        var cryNumber = cryCounterService.getSumCry(name);
        model.addAttribute("name", name + " cried " + cryNumber);
        return "index";
    }

    @GetMapping("/add")
    public String addCry(@RequestParam(name="name", required = false,
            defaultValue = "World") String name, Model model) {
        name = "Mariia";
        cryCounterService.cry(name, 5);
        model.addAttribute("name", name);
        return "index";
    }
}
