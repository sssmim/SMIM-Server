package com.smim.mysql_db.controller;

import com.smim.mysql_db.repository.*;
import com.smim.mysql_db.service.*;
import com.smim.mysql_db.table.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class TotalRestController {

    private final PersonalRepository personalRepository;

    private final PersonalService personalService;

    private final OrganizationRepository organizationRepository;

    private final OrganizationService organizationService;

    private final GExerciseRepository gExerciseRepository;

    private final GExerciseService gExerciseService;

    private final IExerciseRepository iExerciseRepository;

    private final IExerciseService iExerciseService;

    private final VideoRepository videoRepository;

    private final IElistRepository ielistRepository;

    private final ReservationRepository reservationRespository;

    private final IEtimeRepository ietimeRepository;

    private final IEtimeService ietimeService;

    private final BoardRepository boardRepository;

    private final CommentRepository commentRepository;

    private final ItemRepository itemRepository;

    private final ItemService itemService;

    @GetMapping("/comment")
    public List<Comment> getComment() {
        return commentRepository.findAll();
    }

    @PostMapping("/comment")
    public Comment createComment(@RequestBody CommentDto commentDto) {
        Comment comment = new Comment(commentDto);
        return commentRepository.save(comment);
    }

    @GetMapping("/board")
    public List<Board> getBoard() {
        return boardRepository.findAll();
    }

    @PostMapping("/board")
    public Board createBoard(@RequestBody BoardDto boardDto) {
        Board board = new Board(boardDto);
        return boardRepository.save(board);
    }

    @GetMapping("/reservation")
    public List<Reservation> getReservation() {
        return reservationRespository.findAll();
    }

    @PostMapping("/reservation")
    public Reservation createReservation(@RequestBody ReservationDto reservationDto) {
        Reservation reservation = new Reservation(reservationDto);
        return reservationRespository.save(reservation);
    }

    @GetMapping("/personal")
    public List<Personal> getPersonal() {
        return personalRepository.findAll();
    }

    @PostMapping("/personal")
    public Personal createPersonal(@RequestBody PersonalDto personalDto) {
        Personal personal = new Personal(personalDto);
        return personalRepository.save(personal);
    }

    @PutMapping("/personal/{mem_num}")
    public Long updatePersonal(@PathVariable Long mem_num, @RequestBody PersonalDto personalDto) {
        return personalService.update(mem_num, personalDto);
    }

    @DeleteMapping("/personal/{mem_num}")
    public Long deletePersonal(@PathVariable Long mem_num) {
        personalRepository.deleteById(mem_num);
        return mem_num;
    }

    @GetMapping("/organization")
    public List<Organization> getOrganization() {
        return organizationRepository.findAll();
    }

    @PostMapping("/organization")
    public Organization createOrganization(@RequestBody OrganizationDto organizationDto) {
        Organization organization = new Organization(organizationDto);
        return organizationRepository.save(organization);
    }

    @PutMapping("/organization/{group_num}")
    public Long updateOrganization(@PathVariable Long group_num, @RequestBody OrganizationDto organizationDto) {
        return organizationService.update(group_num, organizationDto);
    }

    @DeleteMapping("/organization/{group_num}")
    public Long deleteOrganization(@PathVariable Long group_num) {
        organizationRepository.deleteById(group_num);
        return group_num;
    }

    @GetMapping("/gexercise")
    public List<GExercise> getGExercise() {
        return  gExerciseRepository.findAll();
    }

    @PostMapping("/gexercise")
    public GExercise createGExercise(@RequestBody GExerciseDto gexerciseDto) {
        GExercise gexercise = new GExercise(gexerciseDto);
        return gExerciseRepository.save(gexercise);
    }

    @PutMapping("/gexercise/{ge_num}")
    public Long updateGExercise(@PathVariable Long ge_num, @RequestBody GExerciseDto gexerciseDto) {
        return gExerciseService.update(ge_num, gexerciseDto);
    }

    @DeleteMapping("/gexercise/{ge_num}")
    public Long deleteGExercise(@PathVariable Long ge_num) {
        gExerciseRepository.deleteById(ge_num);
        return ge_num;
    }

    @GetMapping("/iexercise")
    public List<IExercise> getIExercise() {
        return  iExerciseRepository.findAll();
    }

    @PostMapping("/iexercise")
    public IExercise createIExercise(@RequestBody IExerciseDto iexerciseDto) {
        IExercise iexercise = new IExercise(iexerciseDto);
        return iExerciseRepository.save(iexercise);
    }

    @PutMapping("/iexercise/{ie_num}")
    public Long updateIExercise(@PathVariable Long ie_num, @RequestBody IExerciseDto iexerciseDto) {
        return iExerciseService.update(ie_num, iexerciseDto);
    }

    @DeleteMapping("/iexercise/{ie_num}")
    public Long deleteIExercise(@PathVariable Long ie_num) {
        iExerciseRepository.deleteById(ie_num);
        return ie_num;
    }

    @GetMapping("/list")
    public List<IElist> getList() {
        return ielistRepository.findAll();
    }

    @PostMapping("/list")
    public IElist createList(@RequestBody IElistDto ielistDto) {
        IElist ieList = new IElist(ielistDto);
        return ielistRepository.save(ieList);
    }

    @DeleteMapping("/list/{list_num}")
    public Long deleteList(@PathVariable Long list_num) {
        ielistRepository.deleteById(list_num);
        return list_num;
    }

    @GetMapping("/video")
    public List<Video> getVideo() {
        return videoRepository.findAll();
    }

    @GetMapping("/ietime")
    public List<IEtime> getIEtime() {
        return ietimeRepository.findAll();
    }

    @PostMapping("/ietime")
    public IEtime createIEtime(@RequestBody IEtimeDto ietimeDto) {
        IEtime ietime = new IEtime(ietimeDto);
        return ietimeRepository.save(ietime);
    }

    @PutMapping("/ietime/{iet_num}")
    public Long updateIEtime(@PathVariable Long iet_num, @RequestBody IEtimeDto ietimeDto) {
        return ietimeService.update(iet_num, ietimeDto);
    }

    @DeleteMapping("/ietime/{iet_num}")
    public Long deleteIEtime(@PathVariable Long iet_num) {
        ietimeRepository.deleteById(iet_num);
        return iet_num;
    }

    @GetMapping("/item")
    public List<Item> getItem() {
        return itemRepository.findAll();
    }

//    @PostMapping("/item")
//    public Item createItem(@RequestBody ItemDto itemDto) {
//        Item item = new Item(itemDto);
//        return itemRepository.save(item);
//    }

    @PutMapping("/item/{item_num}")
    public Integer updateItem(@PathVariable Integer item_num, @RequestBody ItemDto itemDto) {
        return itemService.update(item_num, itemDto);
    }

    @DeleteMapping("/item/{item_num}")
    public Integer deleteItem(@PathVariable Integer item_num) {
        itemRepository.deleteById(item_num);
        return item_num;
    }
}
