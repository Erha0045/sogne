// function getSogne() {
//     console.log("GET sogne"); //log til consol
//     //Ajax request - hent sogne
//     $.ajax({
//         url:"/sogne",
//         type:"GET",
//         contentType:"application/JSON",
//         success:function (data) {
//             $.each(data, function (index, item) { //iterer over collection i data
//                 $("#sogneList").append("<div>" + item.name + "</div>") //tilføj ny div til carlist
//             })
//             $("#status").html("Svar fra server OK");
//         },
//         error:function (data) {
//             $("#status").html("Svar fra server ERROR");
//         }
//     });
// }
//
// function preventSubmit(form){
//     form.submit(function(event){
//         event.preventDefault(); // forhindr formen i at blive sendt, når der trykkes submit
//         createSogne($("#name").val()); // tekst i inputfeltet
//     });
// }
//
// function createSogne(sogneName){
//     var createSogneObject = {};
//     createSogneObject["name"] = sogneName;
//     console.log("Create " + sogneName);
//     $.ajax({
//         url:"/sogne",
//         type:"POST",
//         contentType:"application/JSON",
//         data:JSON.stringify(createSogneObject),
//         success:function(data){
//             console.log("Sogne created: " + data.name);
//             $("#sogneList").append("<div>" + data.name + "</div>"); //tilføj til sogneListen
//             $("#status").html("<br>Svar fra server OK");
//         },
//         error:function(data){
//             $("#status").html("<br>Svar fra server ERROR");
//         }
//     });
// }
