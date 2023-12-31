package com.example.simplethemetestapp.ui.config_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.simplethemetestapp.R
import com.example.simplethemetestapp.ui.components.GroupItem
import com.example.simplethemetestapp.ui.components.ProfileViews
import com.example.simplethemetestapp.ui.components.UserDetails
import com.example.simplethemetestapp.ui.theme.Gray60

@Composable
fun MessagesBox() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background.copy(alpha = .2f),
        ),
        shape = Shapes().extraLarge
    ) {
        Box {
            LazyColumn(
                modifier = Modifier
                    .background(Color.Transparent)
                    .padding(16.dp)
            ) {
                item {
                    Text(
                        modifier = Modifier.padding(start = 8.dp, bottom = 16.dp),
                        text = "Messages",
                        style = MaterialTheme.typography.headlineMedium,
                        color = MaterialTheme.colorScheme.background,
                        fontWeight = FontWeight.Bold
                    )
                }

                item {
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.background.copy(alpha = .1f),
                        ),
                        shape = Shapes().large
                    ) {
                        Box(Modifier.fillMaxSize()) {
                            Box(
                                modifier = Modifier
                                    .size(32.dp)
                                    .align(Alignment.TopEnd)
                                    .clip(
                                        RoundedCornerShape(
                                            bottomEnd = 0.dp,
                                            bottomStart = 16.dp,
                                            topEnd = 0.dp,
                                            topStart = 0.dp
                                        )
                                    )
                                    .background(
                                        color = MaterialTheme.colorScheme.onBackground.copy(alpha = .1f)
                                    )
                            ) {
                                Icon(
                                    modifier = Modifier
                                        .size(16.dp)
                                        .align(Alignment.Center),
                                    painter = painterResource(id = R.drawable.game_controller),
                                    tint = Gray60,
                                    contentDescription = ""
                                )
                            }
                            Row(modifier = Modifier.background(Color.Transparent), verticalAlignment = Alignment.CenterVertically) {
                                Image(
                                    modifier = Modifier
                                        .size(120.dp)
                                        .padding(8.dp)
                                        .clip(
                                            RoundedCornerShape(
                                                8.dp
                                            )
                                        ),
                                    painter = painterResource(id = R.drawable.test_image),
                                    contentScale = ContentScale.Crop,
                                    contentDescription = ""
                                )
                                Column(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .background(Color.Transparent)
                                ) {
                                    ProfileViews(
                                        modifier = Modifier.background(Color.Transparent),
                                        avatars = listOf(
                                            R.drawable.user1,
                                            R.drawable.user2,
                                            R.drawable.user3
                                        ),
                                        avatarHeight = 24.dp,
                                        paddingUnit = 16.dp
                                    )
                                    Text(
                                        text = "Mallow, Cap and 3 others",
                                        style = MaterialTheme.typography.titleMedium,
                                        color = MaterialTheme.colorScheme.secondary
                                    )
                                    Text(
                                        text = "SketchHeads",
                                        style = MaterialTheme.typography.titleMedium,
                                        color = MaterialTheme.colorScheme.secondary.copy(alpha = .6f)
                                    )
                                }

                            }
                        }
                    }
                }
                item {
                    LazyColumn(
                        Modifier
                            .padding(top = 8.dp, bottom = 24.dp)
                            .height(170.dp)
                    ) {
                        item {
                            UserDetails(avatarId = R.drawable.user1, isActive = true)
                        }
                        item {
                            GroupItem(
                                avatarPair = Pair(R.drawable.user1, R.drawable.user2)
                            )
                        }
                        item {
                            UserDetails(avatarId = R.drawable.user2, isActive = false)
                        }
                    }
                }
            }
            Button(modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth()
                .align(Alignment.BottomCenter), onClick = { /*TODO*/ }) {
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = "Get Nitro",
                    style = MaterialTheme.typography.labelLarge
                )
            }
        }
    }
}