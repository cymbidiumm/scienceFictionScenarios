package com.gmailcymbidiumm.sciencefictionscenarios;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarTitle = findViewById(R.id.titleTextToolbar);
        toolbar.setTitle("");
        toolbarTitle.setText("Scenarios");
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView=(ListView)findViewById(R.id.listview);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("\n");
        arrayList.add("\n");
        arrayList.add("A rogue planet with strange properties collides with our sun, and after it’s all over, worldwide temperature falls forty degrees. Imagine from the perspective of a someone trying to keep his tropical fruit trees alive.\n");
        arrayList.add("An alien planet starts receiving bizarre audio transmissions from another world (spoiler: they’re from Earth). What does it mean? Are they under attack? Some think so…until classic rock ‘n’ roll hits the airwaves, and these aliens discover dancing. Imagine from the perspective of the teenaged alien who first figures it out.\n");
        arrayList.add("Take anything we find normal today (shopping malls, infomercials, products to remove facial hair, etc.) and imagine a story from the perspective of an archeologist five thousand years in the future who just unearthed this stuff, has NO idea what any of it was for, and has to give a speech in an hour explaining the historical/religious/sociological significance.\n");
        arrayList.add("Housecats are aliens who have succeeded in their plan to rule the world. Discuss.\n");
        arrayList.add("Ever read about the world’s loneliest whale? Imagine a story in which he’s actually the survivor of an aquatic alien species which crashed here eons ago, and he’s trying very hard to learn the “local” whale language so he can fit in. Write from his perspective the first time he makes contact.\n");
        arrayList.add("Aliens who only communicate with sign language invade. To avoid war, our governments must engage a vastly marginalized portion of the human population: the hearing-impaired.Discuss.\n");
        arrayList.add("A highschooler from fifteen hundred years in our future is assigned a one-page writing project on a twenty-first century person’s life based entirely on TV commercials. Imagine the beginning of the essay.\n");
        arrayList.add("Timetravel works, but only once in a person’s life. Imagine from the perspective of someone who chooses to go back in time, knowing they can never return. Where do they go and why?\n");
        arrayList.add("The remarkable San people of South Africa are widely considered the most ancient race of human beings on the planet. Imagine a story in which their unique genetic structure has been preserved by the thousands-of-years-ago creation of nanobots.\n");
        arrayList.add("So yeah, ancient Egypt really was “all that” after all, and the pyramids turn out to be fully functional spaceships (the limestone was to preserve the electronics hidden inside). Imagine from the perspective of the tourist who accidentally turns one on.\n");
        arrayList.add("Ten years from now, scientists figure out how to stop human aging and extend life indefinitely—but every time someone qualifies for that boost, someone else has to die to keep the surplus population in check. Oh, it’s all very humane; one’s descendants get a huge paycheck. Imagine from the perspective of someone who just got a letter in the mail saying they’re the one who has to die.\n");
        arrayList.add("In the future, neural implants translate music into physical pleasure, and earphones (“jacking in”) are now the drug of choice. Write either from the perspective of a music addict, OR the Sonforce agent (sonance + enforcer) who has the job of cracking down.\n");
        arrayList.add("In the nineteenth century, there’s a thriving trade in stolen archeological artifacts. Imagine a story from the perspective of an annoyed, minimum-wage employee whose job is traveling back in time to obtain otherwise unobtainable artifacts, then has to bring them back to the present (the 1800s, that is) and artificially age them before they will sell.\n");
        arrayList.add("Human genetic modification has gone too far, and the biggest trend for teenagers is to BECOME their favorite fictional character. Describe the scene from a bored security guard’s point of view as he has to break up a fight between an anime character (I dare you to use Goku from Dragonball Z) and a Brony.\n");
        arrayList.add("It turns out dinosaurs were completely sentient creatures, thank you very much, and most of them actually left the planet in their gigantic and REALLY WEIRD spaceship when they realized an asteroid was coming. They’ve decided that enough time has passed and the Earth has probably recovered by now, so today, at twelve noon, they’re coming home.\n");
        arrayList.add("Creation myth! Imagine from the perspective of a crazy scientist in the year 28,000 who, determined to discover how the universe began, rigs up a malfunctioning time machine, goes to the “beginning” of the universe, and ends up being the reason for the Big Bang. (Logic? Causal effect? Pfft. Hush, it’s time-travel, and that was never logical.)\n");
        arrayList.add("It is the Edo period in Japan (1603-1868), and the practice of Sakoku is in full effect, completely closing off the country to Western influence. The reason, however, is not to eschew Western culture, but instead to protect the aliens that landed in the middle of Kyoto and are trying desperately to repair their ship and get home. Imagine from the perspective of one of the few remaining Samurai assigned to protect and keep these aliens a secret.\n");
        arrayList.add("It’s the year 5000. Our planet was wrecked in the great Crisis of 3500, and remaining human civilization survives only in a half dozen giant domed cities. There are two unbreakable rules: strict adherence to Life Quality (recycling doesn’t even begin to cover these laws), and a complete ban on reproduction (only the “worthy” are permitted to create new humans). Imagine from the perspective of a young woman who just discovered she’s been chosen to reproduce—but she has no interest in being a mother.\n");
        arrayList.add("An inventive technologist launches a business that allows people to swap lives with other willing individuals.-\n");
        arrayList.add("Back in the 1920s an alien race seeking refuge landed on earth on a small island in the south pacific. For a hundred years they've managed to keep the island cloaked and secret from our human population. But their own population has exploded and they've exhausted the resources of the island. So a team of their own set out find new land.-\n");
        arrayList.add("A secret society of time travelers has come back in time to repair certain aspects of the future. What could go wrong?.\n");
        arrayList.add("A researcher thinks he's found the cure to Alzheimer's using small nanobots that invade the brain and repair it. However, there are unintentional side effects that have consequences.-\n");
        arrayList.add("By year 2120 bionic body part replacements have become common with many crazy variations and enhancements (wheels for feet, weaponized limbs, etc...). For diagnostic reasons, most of these body parts are tied into the manufactuer's network. But the manufacturer of all of those parts has been hacked. And the hacker, with gruesome intentions has figured out how to control those parts-.\n");
        arrayList.add("In the year 2140 children are no longer raised by their parents. Upon birth they are taken to protected colonies where they are very specifically raised to believe and act under a special accord, only returning to their parents on their 10th birthdays.\n");
        arrayList.add("It's 2300 and humans have managed to migrate to several other solar systems within our galaxy but have yet to find intelligent life. Planet hopping intergalactic cruises have become popular. But one has just veered off course and must doc on an unfamiliar but inhabitable (and possibly already non-human inhabited) planet..\n");
        arrayList.add("Michael is an intergalactic space traveler in the year 2093 and he's just crashed on an unfamiliar planet. What he finds appears to be a long abandoned but at one time highly populated and advanced human like society. Virtually stuck on the planet, Michael sets out in a small flying vessel stored in his larger ship to search the planet for signs of life and answers..\n");
        arrayList.add("Years after earth is invaded by an alien species, a man living in a human prison camp thinks he's discovered the alien's weakness. After escaping the prison he organizes a rouge group of volunteers to plan a war to win back the earth..\n");
        arrayList.add("A frozen Earth is discovered and inhabited by aliens centuries after an ice age has has killed off the human race. Now the aliens have found frozen humans below the surface and have start using their advanced technologies to bring them back to life in order to study them..\n");
        arrayList.add("Weddings are stressful. They’re especially tricky when one family is magical and the other hates spells, and both mothers want to control the celebration.");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);
    }
}
